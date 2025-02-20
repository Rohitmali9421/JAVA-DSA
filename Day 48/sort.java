class sort {
    public String frequencySort(String s) {
        int[] freq = new int[256];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)]++;
        }
        char[] res=new char[s.length()];
        for(int i=0;i<s.length();)
        {
            int max=0;
            int index=0;
            for(int j=0;j<256;j++)
            {
                if(max<freq[j])
                {
                    max=freq[j];
                    index=j;
                }
            }
            while(freq[index]>0)
            {
                res[i++]=(char)index;
                freq[index]--;
            }
        }
        return new String(res);
    }
}