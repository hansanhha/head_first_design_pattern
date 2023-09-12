## 2장 요약

소프트웨어 개발에서 변하지 않는 단 한가지  

소프트웨어는 언제나 변한다  

## 디자인 원칙

4. 상호작용하는 객체 사이에는 가능하면 느슨한 결합을 사용해야 한다  


객체 간의 상호 의존성을 최소화하여 변경 사항을 유연하게 처리한다  

## 느슨한 결합 (Loose Coupling)

객체들이 상호작용하지만 서로 잘 모르는 관계  

-> 유연한 디자인 설계  

객체가 다른 객체를 심하게 의존하고 있으면,  

다른 객체의 세세한 부분까지 다 알고 있다면 단단한 결합  

-> 변경 사항 발생시 여파가 크다  


## 옵저버 패턴 

한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에 연락이 가고  

자동으로 내용이 갱신되는 방식으로 일대다 의존성을 정의한다  

출판 - 구독 (Publish-Subscribe) 패턴과 관계가 있지만 같진 않다  

출판 - 구독 패턴은 미들웨어 시스템에서 종종 쓰이는 패턴이다  

subject  

객체가 다른 객체를 심하게 의존하고 있으면,  

다른 객체의 세세한 부분까지 다 알고 있다면 단단한 결합  

-> 변경 사항 발생시 여파가 크다  


## 옵저버 패턴 

한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에 연락이 가고  

자동으로 내용이 갱신되는 방식으로 일대다 의존성을 정의한다  

출판 - 구독 (Publish-Subscribe) 패턴과 관계가 있지만 같진 않다  

출판 - 구독 패턴은 미들웨어 시스템에서 종종 쓰이는 패턴이다  

* subject 객체에서 데이터를 관리
* subject 데이터가 변경되면 observer에게 전달
* observer 객체들은 subject 객체에 등록되어 있으며(구독) subject 데이터가 바뀌면 갱신 내용을 전달받는다
* 객체들은 subject 객체를 구독/해지하여 데이터를 받거나 그만 받을 수 있다

## 옵저버 패턴과 느슨한 결합
* subject는 observer가 특정 인터페이스를 구현한다는 사실만 안다
observer가 무엇을 하는지 알 필요가 없다

* observer는 언제든지 추가할 수 있다
subject는 Observer 인터페이스를 구현하는 객체의 목록에만 의존하므로 언제든 추가/삭제할 수 있다  

* 새로운 형식의 observer를 추가할 때 subject를 변경할 필요가 없다
새로운 observer 클래스는 Observer 인터페이스를 구현하고 observer로 등록하기만 하면 된다  
subject는 신경 쓸 필요가 없다  

* subject와 observer는 서로 독립적으로 재사용할 수 있다
서로 단단하게 결합되어 있지 않기 때문에 다른 용도로 사용할 수 있다  

* subject나 observer가 변경되도 서로에게 영향을 미치지 않는다
각자의 인터페이스를 구현한다는 조건만 만족하면 문제가 되지 않는다  

## 이벤트 발생시 처리
* Push

subject -> observer   

subject에서 observer로 데이터를 보냄   

추후에 요구사항이 변경되었을 때 데이터를 변경하기 어려움  

* Pull

observer <- subject  

observer에서 필요한 데이터만 가져옴  

요구사항에 맞춰 변경에 용이  

