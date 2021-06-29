## 스택
---
- 스택은 데이터를 일시적으로 저장하기 위한 자료구조
<br>

## 스택이란
- 스택(stack)은 데이터를 일시적으로 저장하기 위해 사용하는 자료구조
- 데이터의 입력과 출력 순서는 후입선출이다.(가장 나중에 넣은 데이터를 먼저 꺼낸다)
- 스택에 데이터를 넣는 작업을 푸시(push)라고 하고, 스택에서 데이터를 꺼내는 작업을 팝(pop)이라고 한다.
- 푸시와 팝을 하는 위치를 꼭대기(top) 스택의 가장 아랫부분을 바닥(bottom)이라고 한다.
- 자바 프로그램에서 메서드를 호출하고 실행할 때 프로그램 내부에서는 스택을 사용한다.
- 예제 코드
```
void x(){}

void y(){}

void z(){
    x();
    y();
}

int main(){
    z();
}
```
- 가장 먼저 main 메서드를 실행하여 main 메서드는 z 메서드를 호출한다.
- 호출된 메서드는 x메서드와 y메서드를 순서대로 호출한다.
- 메서드를 호출할때는 푸시하고 메서드가 실행을 종료하고 호출한 원래 메서드로 돌아갈 때는 종료할 메소드를 팝한다.

## 스택 만들기
- 스택을 구현하고자 하는데 저장하는 값은 int형 이다.
```
class IntStack{
    int max;
    int ptr;
    int[] stk;
}
```

### 스택 본체용 배열 : stk
  - 푸시된 데이터를 저장하는 스택 본체의 배열이다.