package hainiu.H0401;
//helljavaworldjavabigdatajavajava中有几个Java单词   查找并截取；改变查询范围，不截取
public class H4 {
    public static void main(String[] args) {
        String str ="helljavaworldjavabigdatajavajava";
        String subStr="java";
        int count1 = search1 (str,subStr);
        int count2=search2(str,subStr);
        System.out.println(count1);
        System.out.println(count2);
    }
    private static int search1(String str, String subStr) {
        int count1=0;
        int index;
        while ((index=str.indexOf(subStr))!=-1){
            count1++;
            str=str.substring(index+subStr.length());
        }
        return count1;
    }
    private static int search2(String str, String subStr) {
        int count2=0;
        int index=0;
        while ((index=str.indexOf(subStr,index+subStr.length()))!=-1){
            count2++;

        }
        return count2;
    }
}
