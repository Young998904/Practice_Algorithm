package Programmers.Algorithm.Etc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 상담예약제 {
    public static void main(String[] args) {
        // Given
        String[][] booked = {{"09:55", "hae"}, {"10:05", "jee"}};
        String[][] unbooked = {{"10:04", "hee"}, {"14:07", "eom"}};

        // 주어진 배열을 Custom 객체로 바꿔서 Queue 에 넣는 과정
        Queue<Customer> bookedCustomers = new LinkedList<>();
        for (String[] customer : booked) {
            bookedCustomers.add(new Customer(customer[1], customer[0]));
        }
        Queue<Customer> unbookedCustomers = new LinkedList<>();
        for (String[] customer :  unbooked) {
            unbookedCustomers.add(new Customer(customer[1], customer[0]));
        }

        // 풀이 시작
        List<String> answer = new ArrayList<>();
        // 시작 시간
        int currentTime = Math.min(bookedCustomers.peek().arrivedTime, unbookedCustomers.peek().arrivedTime);

        while (!bookedCustomers.isEmpty() || !unbookedCustomers.isEmpty()) {
            // 두 Queue 가 모두 비워질 때 까지 반복
            if (bookedCustomers.isEmpty()) {
                // 예약된 고객이 없는 경우 예약되지 않은 고객을 모두 추가하고 종료
                for (Customer c : unbookedCustomers) answer.add(c.name);
                break;
            }
            if (unbookedCustomers.isEmpty()) {
                // 예약되지 않은 고객이 없는 경우 예약된 고객을 모두 추가하고 종료
                for (Customer c : bookedCustomers) answer.add(c.name);
                break;
            }

            Customer bookedCustomer = bookedCustomers.peek();
            Customer unbookedCustomer = unbookedCustomers.peek();

            if (currentTime >= bookedCustomer.arrivedTime) {
                // 현재시간이 예약된 고객의 도착시간 이후하면 예약 고객을 바로 상담
                answer.add(bookedCustomers.poll().name);
                currentTime += 10; // 다음 평가시간은 상담이 종료되는 10분 후
            } else if (currentTime >= unbookedCustomer.arrivedTime) {
                // 현재시간이 예약되지 않은 고객의 도착시간 이후하면 비예약 고객을 바로 상담
                answer.add(unbookedCustomers.poll().name);
                currentTime += 10; // 다음 평가시간은 상담이 종료되는 10분 후
            } else {
                Customer c;
                // 예약/비예약 고객 중 먼저 온 고객을 상담하고
                if (bookedCustomer.arrivedTime < unbookedCustomer.arrivedTime) {
                    c = bookedCustomers.poll();
                } else {
                    c = unbookedCustomers.poll();
                }
                answer.add(c.name);
                // 다음 평가시간은 고객의 상담이 종료되는 도착시간의 10분 후
                currentTime = c.arrivedTime + 10;
            }
        }
        for (String str : answer) {
            System.out.println(str);
        }
    }
}

class Customer {
    final String name;
    final int arrivedTime;

    Customer (String name, String arrivedTime) {
        this.name = name;
        this.arrivedTime = parseTime(arrivedTime);
    }

    private int parseTime(String time) {
        String[] times = time.split(":");
        return Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
    }
}