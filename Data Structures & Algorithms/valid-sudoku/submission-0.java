class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, List<Integer>> rowMap = new HashMap<>();
        Map<Integer, List<Integer>> colMap = new HashMap<>();
        Map<String, List<Integer>> gridMap = new HashMap<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';

                    List<Integer> valueList1 = rowMap.getOrDefault(i, new ArrayList<>());
                    if (valueList1.contains(num)) {
                        return false;
                    } else {
                        valueList1.add(num);
                    }
                    rowMap.put(i, valueList1);

                    List<Integer> valueList2 = colMap.getOrDefault(j, new ArrayList<>());
                    if (valueList2.contains(num)) {
                        return false;
                    } else {
                        valueList2.add(num);
                    }
                    colMap.put(j, valueList2);

                    String gridKey = (i / 3) + "-" + (j / 3);
                    List<Integer> valueList3 = gridMap.getOrDefault(gridKey, new ArrayList<>());
                    if (valueList3.contains(num)) {
                        return false;
                    } else {
                        valueList3.add(num);
                    }
                    gridMap.put(gridKey, valueList3);
                }
            }
        }

        return true;
    }
}
