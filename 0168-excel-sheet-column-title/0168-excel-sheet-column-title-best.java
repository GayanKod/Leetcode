class Solution {
    public String convertToTitle(int columnNumber) {
        
        String output = "";
        char lsb = '0';

        while (columnNumber > 0){
            lsb = (char)((columnNumber - 1)%26 + 'A');
            output = lsb + output;
            columnNumber = (columnNumber-1)/26;
        }

        return output;

    }
}