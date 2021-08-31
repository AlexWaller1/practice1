package com.company;

public class ColumbusLongestCommonPrefix {
    public String columbusString(String[] columbusArray){
        // String[] columbusArray = {"dogs", "dog"};
        if(columbusArray.length == 0) return "There are no elements in this array!";
        // edge case in case there are no elements in the array
        String prefix = columbusArray[0];
        // this string will be compared to the rest of the strings in this array
        // prefix = "dogs";
        for(int hh1 = 1; hh1 < columbusArray.length; hh1++){
            // hh1 will start at 1 in this case since we don't need to compare the prefix to itself
            while(columbusArray[hh1].indexOf(prefix) != 0){
                // while the columbusArray string does not contain the prefix at the index of 0
                // does "dog" contain "dogs" at the index of 0, no it does not
                // does "dog" contain "dog" at the index of 0, yes it does
                prefix = prefix.substring(0, prefix.length() - 1);
                // dropping the last character from the prefix
                // "dogs" becomes "dog"
                if(prefix.isEmpty()) return "There is no common prefix";
            }
        }
        return prefix;
        // "dog"
    }
}
