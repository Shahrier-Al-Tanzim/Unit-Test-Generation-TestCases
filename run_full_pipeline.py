import subprocess
import os
import sys

def run_pipeline():
    # Prompt for source folder (same as RagPipelineMirrorTest.py)
    source_root = input("Enter the path to the source folder: ").strip()
    if not os.path.exists(source_root):
        print(f"[ERROR] The folder '{source_root}' does not exist.")
        return
    
    python_exec = sys.executable
    # Run RagPipelineMirrorTest.py
    print("[INFO] Running RagPipelineMirrorTest.py to generate test files...")
    subprocess.run([python_exec, "RagPipelineMirrorTest.py", source_root], check=True)

    # Compute the test root folder (mirrored logic from RagPipelineMirrorTest.py)
    abs_source = os.path.abspath(source_root)
    parent_dir = os.path.dirname(abs_source)
    test_root = os.path.join(parent_dir, os.path.basename(abs_source) + 'Test')
    print(f"[INFO] Cleaning generated test files in: {test_root}")

    # Run RagPipelineCleanAllTests.py
    subprocess.run([python_exec, "RagPipelineCleanAllTests.py"], input=f"{test_root}\n", text=True, check=True)
    print("[INFO] Pipeline complete. Cleaned test files are in the 'Clean' subfolder of the test tree.")

if __name__ == "__main__":
    run_pipeline()
