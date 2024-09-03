import java.util.*;

    public class SimplifyPathStack {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        for (String component : components) {
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!component.equals(".") && !component.isEmpty()) {
                stack.push(component);
            }
        }

        StringBuilder canonicalPath = new StringBuilder();
        for (String dir : stack) {
            canonicalPath.append("/").append(dir);
        }

        return canonicalPath.length() > 0 ? canonicalPath.toString() : "/";
    }

    public static void main(String[] args) {
        // Test cases
        String path1 = "/home/";
        String path2 = "/../";
        String path3 = "/home//foo/";
        String path4 = "/a/./b/../../c/";

        System.out.println(simplifyPath(path1)); // Output: "/home"
        System.out.println(simplifyPath(path2)); // Output: "/"
        System.out.println(simplifyPath(path3)); // Output: "/home/foo"
        System.out.println(simplifyPath(path4)); // Output: "/c"
    }
}

