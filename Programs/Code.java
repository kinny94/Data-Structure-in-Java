/* package whatever; // don't place package name! */
//without OOP and using hashmaps but chnaged return type
import java.io.*;
import java.util.*;

class Code
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Code mc = new Code();
        System.out.println(mc.rankedNgramList("DANDAN", 2));
        System.out.println(mc.rankedNgramList("DANDAN", 3));
        //System.out.println(mc.replaceAll("Daniel Mesa", "Mesa", "Roman"));
    }
    
    /*
         DANDAN, 2 -> DA 2, AN 2, ND 1
         DANDAN, 3 -> DAN 2, AND 1, NDA 1
     */
    //private List<Ngram> rankedNgramList(String input, int n)

         private List<Ngram> rankedNgramList(String input, int n)
         {
        //char[] charArr = new char[input.length];
        //int[] freq = ;
        //Ngram ng = new Ngram();
            HashMap<String, Ngram> ngram = new HashMap<String, Ngram>();
            List<Ngram> list = null;
            Ngram newNgram = null;

            for(int i=0; i <= input.length() - n; i++)
            {
                String gram = input.substring(i, i+n);
                if(!ngram.containsKey(gram)){
                    newNgram = new Ngram(gram, 1);
                    ngram.put(gram, newNgram);
                    // ngram.put(gram,1);
                }else{
                    newNgram = ngram.get(gram);
                    newNgram.incrementFrequency();
                    // int freq = ngram.get(gram) + 1;
                    // ngram.put(gram,freq);
                }
            }

            list = new ArrayList<Ngram>();
            Iterator it = ngram.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                list.add((Ngram) pair.getValue());  
            }

            return list;
        }


        class Ngram 
        {
            private String gram;
            private int frequency;

            public Ngram()
            {

            }

            public Ngram(String gram, int frequency)
            {
                this.gram = gram;
                this.frequency = frequency;
            }

            public int incrementFrequency()
            {
                frequency++;

                return frequency;
            }

            public String getGram()
            {
                return gram;
            }

            public void setGram(String gram)
            {
                this.gram = gram;
            }

            public int getFrequency()
            {
                return frequency;
            }

            public void setFrequency(int frequency)
            {
                this.frequency = frequency;
            }

            @Override
            public String toString()
            {
                return gram + ": " + frequency;
            }

        }

    /* 
        Daniel Mesa, Mesa, Roman -> Daniel Roman
        Daniel, nie, abd -> Daabcl
        Daniel, nie, a -> Daal
    */
        private String replaceAll(String input, String stringToReplace, String replacementString)
        {
            return "";
        }
    }
