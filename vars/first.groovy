def call(Map map){
  echo "Hey ${map.name}, here I am, age of ${map.age}"
  def newAge = calcul(map.age)
  echo "Hey ${map.name}, here I am, age of ${newAge}"
}

def int calcul(int a){
  def x = a+a
  echo 'XXX:${x}'
  return x
}
