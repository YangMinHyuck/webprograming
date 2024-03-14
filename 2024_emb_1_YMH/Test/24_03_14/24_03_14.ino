#define RledBin D1
#define ButtonPin D3

// 전역변수 선언
// int b_Val; // 버튼벌류 선언
// bool b_Val;
bool b_Val_current;
bool b_Val_old = true;

void setup() { // 설정 관련 code를 여기에다가 작성
  // put your setup code here, to run once:
 pinMode(RledBin, OUTPUT); // D1은 출력
 pinMode(ButtonPin, INPUT); // D3는 입력
 
}

void loop() { // 주기적으로 무한정 실행 for(;;) = while문과 같음 1이면 HIGH 0이면 LOW
  // put your main code here, to run repeatedly:
  /*
 digitalWrite(D1, HIGH); // LED ON
 delay(1000); // ms 단위
 digitalWrite(D1, LOW); // LED OFF
 delay(1000); // ms 단위
 */
 /*b_Val = digitalRead(ButtonPin);
 if(b_Val == false){ // Button Down 
   digitalWrite(RledBin, HIGH); // LED ON
  }
  else{ // Button Up
     digitalWrite(RledBin, LOW); // LED OFF
    }*/
  b_Val_current = digitalRead(ButtonPin);
  if(b_Val_current == false && b_Val_old == true){
     digitalWrite(RledBin, HIGH); // LED ON
    }
    else{
      digitalWrite(RledBin, LOW); // LED OFF
      }
      b_Val_old = b_Val_current;
}
