document.addEventListener('DOMContentLoaded', () =>{

    let BigCount=prompt("대수의 법칙을 증명할 수는?", 1000)
    //for문을 돌면서 계속 태그에 글자를 적을 예정
    let numArr=[0,0,0,0,0,0]
    for(let i=0; i<BigCount; i++)
    {
        //0이상 6미만의 값을 넣는다.
        //배열의 인덱스는 0부터 시작하니가 1을 안 더해준다.
        let random = Math.floor(Math.random()*6);
        numArr[random]++
    }
    //6칸 짜리 배열에 숫자가 잘 나오는 걸 확인 할 수 있다.
    console.log(numArr)

    for(let i = 0; i<numArr.length; i++){
        document.querySelector('h1.num'+(i+1)).innerText=numArr[i]
    }

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
    
    document.querySelector('h1.numTitle'+maxIndex).setAttribute('class','max')
    document.querySelector('h1.num'+maxIndex).setAttribute('class','max')
    document.querySelector('h2.num'+maxIndex).setAttribute('class','max')
    
}
)
