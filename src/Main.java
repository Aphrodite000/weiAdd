public class Main {
    //位运算加法
    public int addAB(int A, int B) {
        // write code here
        while(B!=0){
            //A异或B，只要有1就为1，相比A+B只是该进位的地方没有进位
            int a=A^B;
            //A与B，都是1才为1，左移1位相当于乘以2的n次方
            //AB都为1需要进位，向左进位就左移1
            int b=(A&B)<<1;
            //去算a与进位，也就是b的加法，直到进位为0，循环结束
            A=a;
            B=b;
        }
        return A;
    }
}
