/*
Problem Statement:
Write a Java program that outputs all possible strings formed by using the characters 'c', 'a', 'r', 'b', 'o', and 'n' exactly once.
Example:
For 3 characters ‘C’, ‘A’, ‘R’, the possible strings are
CAR
CRA
RCA
RAC
ACR
ARC
*/

public class A1Q4 {
    public static void main(String[] args){
        String st="carbon";
        int n=st.length();
        for(int i=0;i<n;i++){
            char ch1=st.charAt(i);
            for(int j=0;j<n;j++){
                char ch2=st.charAt(j);
                for(int k=0;k<n;k++){
                    char ch3=st.charAt(k);
                    for(int l=0;l<n;l++){
                        char ch4=st.charAt(l);
                        for(int m=0;m<n;m++){
                            char ch5=st.charAt(m);
                            for(int o=0;o<n;o++){
                                char ch6=st.charAt(o);
                                if(ch1!=ch2&&ch1!=ch3&&ch1!=ch4&&ch1!=ch5&&ch1!=ch6&&ch2!=ch3&&ch2!=ch4&&ch2!=ch5&&ch2!=ch6&&ch3!=ch4&&ch3!=ch5&&ch3!=ch6&&ch4!=ch5&&ch4!=ch6&&ch5!=ch6)
                                    System.out.println(" "+ch1+ch2+ch3+ch4+ch5+ch6);
                            }
                        }
                    }
                }
            }
        }
    }
}