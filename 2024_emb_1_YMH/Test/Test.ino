void setup() { // 설정 관련 code를 여기에다가 작성
  // put your setup code here, to run once:
 pinMode(D1, OUTPUT); // D1은 출력
 
}

void loop() { // 주기적으로 무한정 실행 for(;;) = while문과 같음 1이면 HIGH 0이면 LOW
  // put your main code here, to run repeatedly:
 digitalWrite(D1, HIGH); // LED ON
 delay(1000); // ms 단위
 digitalWrite(D1, LOW); // LED OFF
 delay(1000); // ms 단위
}
