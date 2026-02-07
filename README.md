# Taller Persistencia

## Enlaces de interés
<!-- 
mappedBy:
El mappedBy se utiliza para describir la relacion entre dos entidades, y depende de su tipo de relacion. El mappedBy solo puede estar cuando es una relacion de muchas (OneToMany,ManyToOne,ManyToMany) y se coloca en cualquiera de las dos entidades pero solo puede estar en una de las dos que conforman dicha relacion. Ahora, lo que va dentro es el como la otra entidad conoce a la entidad en la cual se coloca el mappedBy. EJ: movie-director, si se coloca el mappedBy en la entidad de movie esta debe ser igual a movies, ya que es como la entidad director conoce a movie. Y si se coloca en director, mappedBy debe ser igual a director, ya que la entidad movie conoce a la entidad director como director. Por eso es importante colocar los nombres en la relacion, ya que esos nombres son los que se utilizan para utilizar el mappedBy correctamente.

Movie -> Director:
Se uso ManyToOne ya que hay una relacion de muchas peliculas por un solo director (*...1)

Director -> Movie:
Se uso OneToMany ya que hay una relacion de un solo director a muchas peliculas (1...*)

Genre -> Movie:
Se uso ManyToMany ya que para una pelicula hay muchos generos, pero para un genero hay muchas peliculas tambien, entonces la relacion es de muchas a muchas (*...*)

Movie -> Genre:
Se uso ManyToMany ya que para una pelicula hay muchos generos, pero para un genero hay muchas peliculas tambien, entonces la relacion es de muchas a muchas (*...*)

Movie -> Script:
Se uso OneToOne porque una instancia de movie conoce a una instancia de script.

Script -> Movie:
No hay relacion (es una relacion unidireccional, osea que Script no conoce a Movie de regreso) 
-->



- [BookstoreBack](https://github.com/Uniandes-isis2603/bookstore-back) -> Repositorio de referencia para el Back
