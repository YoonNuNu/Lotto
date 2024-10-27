package com.study;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tickets;

        // 최대 5장까지의 티켓 수 입력
        while (true) {
            System.out.print("로또 구매 장수를 입력해주세요.(최대 5장): ");
            tickets = sc.nextInt();
            if (tickets > 0 && tickets <= 5) break;
            System.out.println("잘못 입력했습니다. 1~5 사이의 숫자를 입력해주세요.");
        }

        // 각 티켓 생성 및 출력
        for (int i = 1; i <= tickets; i++) {
            System.out.printf("티켓 %d: %s\n", i, generateLottoNumbers());
        }
        sc.close();
    }

    // 중복 없는 로또 번호 6개 생성 및 정렬하여 반환
    private static List<Integer> generateLottoNumbers() {
        Random random = new Random();
        Set<Integer> lottoNumbers = new HashSet<>();
        while (lottoNumbers.size() < 6) {
            lottoNumbers.add(random.nextInt(45) + 1);
        }
        List<Integer> lottoList = new ArrayList<>(lottoNumbers);
        Collections.sort(lottoList);
        return lottoList;
    }
}
