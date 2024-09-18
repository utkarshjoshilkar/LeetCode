class Solution {
    public String defangIPaddr(String address) {
        
        // for(int i=0;i<address.length();i++){
        //     if(charAt(i)=='.'){

        //     }
        // }
        return address.replace(".","[.]");
    }
}