object first {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def sum(a:Int, b:Int)= {
  		println(a+b)
  		a+b
  }                                               //> sum: (a: Int, b: Int)Int
  
  sum(3,4)                                        //> 7
                                                  //| res0: Int = 7

// recursive call of function ===========================
def factorial(n:Int): Int ={

 if (n==1)
  return 1
  
  if(n==0)
  return 0
 
 return n * factorial(n-1)

}                                                 //> factorial: (n: Int)Int


 factorial(3)                                     //> res1: Int = 6
 factorial(0)                                     //> res2: Int = 0
  factorial(1)                                    //> res3: Int = 1
  
  // default arguments in function =========================
  
  def func(a:Int, b:Int=7)={
  a+b
  }                                               //> func: (a: Int, b: Int)Int
  
  func(1,7)                                       //> res4: Int = 8
  func(4)                                         //> res5: Int = 11
  
  
  def func2(a:Int=7, b:Int)={
  		a+b
  }                                               //> func2: (a: Int, b: Int)Int
  
  func2(1,7)                                      //> res6: Int = 8
 // func2(4)              this will not work and will give error: not enough arguments for method func2: (a: Int, b: Int)Int. Unspecified value parameter b.
                // default argument should be in last of method definition OR specify the name of parameter first while calling a function
                
  func2(a=1, b=7)                                 //> res7: Int = 8
  
  
  
  // variable arguments with scala functions when you don't know how many arguments you want to pass in function ============
  
 def sumNew(args:Int*)= {
 
 var result =0
 for(arg <-args){
 	result += arg
 }
 
 result
 }                                                //> sumNew: (args: Int*)Int
 
 sumNew(1)                                        //> res8: Int = 1
 sumNew(2,3,4,5,6)                                //> res9: Int = 20
 
 
 
 // higher order function =====================
 
 
 def sayHelloNew(s:String)={
 		println("Hi "+s)
 		"How are your"+s
 }                                                //> sayHelloNew: (s: String)String
 
 
 val name: String= "Sumit"                        //> name  : String = Sumit
 
 
 def funcNew(f:String=>String, name:String){
 
 f(name)
 
 }                                                //> funcNew: (f: String => String, name: String)Unit
 
// now calling function funcNew
funcNew(sayHelloNew, name)                        //> Hi Sumit

// Anonymous Function ==================

val sum3=(a:Int,b:Int)=>a+b                       //> sum3  : (Int, Int) => Int = first$$$Lambda$10/1060830840@7f63425a
 sum3(2,5)                                        //> res10: Int = 7


// currying functions ============

def sum4(a:Int) =(b:Int) =>{

a+b;
}                                                 //> sum4: (a: Int)Int => Int


def sayHello2(name:String){
  println("Hi"+name)

}                                                 //> sayHello2: (name: String)Unit


val add = sum4(2)                                 //> add  : Int => Int = first$$$Lambda$11/2114889273@71be98f5
sayHello2("sumit")                                //> Hisumit
add(5)                                            //> res11: Int = 7
}