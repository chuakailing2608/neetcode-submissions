class Solution {

    public String encode(List<String> strs) {
        if (strs.size() <= 0) {
            System.out.println(strs.toString());
            return strs.toString();
        }

        String output = strs.get(0);
        for(int i = 1; i < strs.size(); i++){
            output = output.concat("///" + strs.get(i));
        }
        return output;
    }

    public List<String> decode(String str) {

        List<String> output = new ArrayList<>();
        if (str.equals("[]")) {
            return output;
        }

        String[] strList = str.split("///");
        for(int i = 0; i < strList.length; i++){
            //System.out.println(strList[i]);
            output.add(strList[i]);
        }
        return output;
    }
}
