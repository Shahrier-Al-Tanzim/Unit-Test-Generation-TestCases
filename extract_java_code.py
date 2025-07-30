def extract_java_code(input_file, output_file):
    code_lines = []
    inside_code = False
    with open(input_file, 'r', encoding='utf-8') as f:
        for line in f:
            if not inside_code:
                if line.strip() == "```java":
                    inside_code = True
            else:
                if line.strip() == "```":
                    break
                code_lines.append(line)
    # Write the extracted code to the output file
    with open(output_file, 'w', encoding='utf-8') as out:
        out.writelines(code_lines)

# Example usage:
# extract_java_code('TestNew.java', 'TestNewClean.java')
