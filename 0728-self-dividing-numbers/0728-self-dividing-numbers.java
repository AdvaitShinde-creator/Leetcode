class Solution {

    public boolean selfcheck(int num){
        int temp = num;
        while(num > 0){
            int a = num%10;
            if(a == 0){
                return false;
            }
            if(temp % a != 0){
                return false;
            }
            num = num/10;
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr = new ArrayList<>();

        for(int i = left ; i <= right ; i++){
            if(i < 10){
                arr.add(i);
            }
            else if(selfcheck(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}