class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        // Collections ans= new ArrayList();
        ArrayList<Integer>list= new ArrayList<>();
        int n=words.length;
        int j=0;
        for (int i = 0; i < n; i++) {
            if (words[i].indexOf(x)!=-1) {
                list.add(i);
            }
        }

        return list ;
    }
}