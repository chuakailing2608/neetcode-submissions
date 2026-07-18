class Solution {

    public String encode(List<String> strs) {

        if (strs.isEmpty()) {
            return strs.toString();
        }

        String output = strs.get(0);
        if (strs.get(0) == "") {
            output = " ";
        } 

        for (int i = 1; i < strs.size(); i++) {

            String input = strs.get(i);
            if (strs.get(i) == "") {
                input = " ";
            }

            output = output + "///" + input;
        }
        return (output);
    }

    public List<String> decode(String str) {

        if (str.equals("[]")) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }

        List<String> output = Arrays.asList(str.split("///"));
        for (int i = 0; i < output.size(); i++) {
            if (output.get(i).equals(" ")) {
                output.set(i, "");
                System.out.println("hi");
            } 
        }
        return output;
    }
}
