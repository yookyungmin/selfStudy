package main.Lv1;

/*
1. 지폐가 지갑보다 크기가 크다면 지폐를 접어야한다.
2. 지폐는 길이가 긴 쪽을 반으로 접는다.
3. 접은 지폐를 그대로 넣을 수 있다면 지갑에 넣는다.
4. 접은 지폐를 그대로 넣을 수 없다면 옆으로 돌려서 넣는 시도를 한다.
5. 돌려서 넣을 수 없다면 다시 긴 쪽을 반으로 접는다.
      */
public class WalletBill {
    public int solution(int[] wallet, int[] bill){

        int answer = 0;

        while(true) {
            int wallet_min = Math.min(wallet[0], wallet[1]);
            int wallet_max = Math.max(wallet[0], wallet[1]);
            int bill_min = Math.min(bill[0], bill[1]);
            int bill_max = Math.max(bill[0], bill[1]);

            if (bill_min > wallet_min || bill_max > wallet_max) {
                if (bill[0] > bill[1]) {
                    bill[0] = bill[0] / 2;
                } else {
                    bill[1] = bill[1] / 2;
                }
                answer++;
            } else {
                break;
            }

        }
        return answer;
    }
}
