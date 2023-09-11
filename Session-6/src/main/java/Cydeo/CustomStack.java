package Cydeo;

public class CustomStack {

        int[] data;
        int topIndex=0;
        int max;
        public CustomStack(int maxSize) {
            this.data =new int[maxSize];
            this.max=maxSize;
        }

        public void push(int x) {
            if(topIndex==data.length) return;
            data[topIndex++]=x;
        }

        public int pop() {
            if(topIndex==0){
                return -1;
            }
            return data[--topIndex];
        }

        public void increment(int k, int val) {
            int i=0;
            while (k>0 && i<topIndex){
                data[i]=data[i]+val;
                k--; i++;
            }
        }

}
