document.addEventListener('DOMContentLoaded', () =>{

    let BigCount=prompt("대수의 법칙을 증명할 수는?", 1000)
    //for문을 돌면서 계속 태그에 글자를 적을 예정
    
    for(let i=0; i<BigCount; i++)
    {
        //1부터 6까지의 정수를 가져오는 부분
        let random = Math.floor(Math.random()*6)+1;
        //Math.random(): 0이상 1미만의 실수를 가져옴
        //최소 0 최대 0.9999999999999999999
        //여기에 6을 곱하면 최소 0, 최대5.9999999999999가 나옴
        //math.floor:소수점을 버리는 함수
        //0부터 5가 나오게 한 다음 여기에 1을 더함
        //따라서 1부터 6을 뽑게 됨

        //num=h1태그 중에서 클래스 명이 num중 랜덤 으로 나오는 것
        //innerHTML 해당 태그 안에 있는 모든 태그 및 XML 등
        //innserText 해당 태그 안에 있는 글자들
        
        let num= document.querySelector('h1.num'+String(random))
        let count = parseInt(num.innerHTML)
        count++
        num.innerHTML = count
    }
    

    //가장 큰 숫자에 대하여 색깔도 칠하고
    let max = 0
    let maxIndex =0 
    for(let i=1; i<=6; i++){

        let value=document.querySelector('h1.num'+i).innerText
        if(max<value)
        {
            max=value;
            maxIndex= i
        }
        value = (value/BigCount)*100
        document.querySelector('h2.num'+i).innerText = parseFloat(value).toFixed(2)+'%'
    }
    //각각의 숫자에 대한 확률도 적어보자.

    //색 칠하기
    
    document.querySelector('h1.num'+maxIndex).setAttribute('class','max')
    document.querySelector('h2.num'+maxIndex).setAttribute('class','max')
}
)
