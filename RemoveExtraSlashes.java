class RemoveExtraSlashes {
    public static void main(String[] args) {
        String str = "///a//b/c/def/////g/h";
        StringBuilder build = new StringBuilder(str);
        for(int i = 0; i < build.length(); i++) {
            if (build.charAt(i) == '/' && build.charAt(i+1) == '/') {
                build.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(build);
    }
}
