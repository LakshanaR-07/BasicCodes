class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] sn1 = num1.split("\\+");
        String[] sn2 = num2.split("\\+");
        int a=Integer.parseInt(sn1[0]);
        int b=Integer.parseInt(sn1[1].replace("i",""));
        int c=Integer.parseInt(sn2[0]);
        int d=Integer.parseInt(sn2[1].replace("i",""));
        int r=(a*c)-(b*d);
        int i=(a*d)+(c*b);
        return r+"+"+i+"i";
    }
}