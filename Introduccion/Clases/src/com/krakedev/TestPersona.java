package com.krakedev;
/* 
 * Muchos comentarios
 */
public class TestPersona {

	public static void main(String[] args) {
		//Declaro una variable de tipo persona llamada p
		Persona p;
		
		//3.Acceder a los atributos
		p=new Persona(); //creando el objeto Persona y guardando
		System.out.println("nombre "+p.nombre);
		System.out.println("edad "+p.edad);
		System.out.println("statura "+p.estatura);
		
		//Persona 2
		Persona p2=new Persona();
		//Ingresar datos en p2
		p2.nombre="Angelina";
		// Mostrar los objetos de p2
		System.out.println("*************");
		System.out.println("p.nombre :"+p.nombre);
		System.out.println("p2.nombre :"+p2.nombre);
		
		//4. Modificar los atributos
		p.nombre="Mario";
		p.edad=45;
		p.estatura=1.56;
		
		System.out.println("-------------------------");
		//5. Acceder a los atributos
		System.out.println("nombre :"+ p.nombre);
		System.out.println("edad :"+ p.edad);
		System.out.println("estatura :"+ p.estatura);
	}

}
