//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Persona pp = new Persona("Pepe", "Blanco", 43);
    Persona persona2 = new Persona("Paco", "Garcia", 54);
    IO.println(pp.getNombre());
    pp.setNombre("jose");
    IO.println(pp.getNombre());
    IO.println(pp.personaToString());

}
