public class RegistroZoo {

    public String AnimalesZoo() {
        return "Nombre: León | Especie: Panthera leo | Característica: Melena grande | Característica Bonita: Su rugido se escucha a varios kilómetros\n"
                + "Nombre: Elefante | Especie: Loxodonta africana | Característica: Orejas grandes | Característica Bonita: Su trompa tiene más de 40 mil músculos\n"
                + "Nombre: Tigre | Especie: Panthera tigris | Característica: Rayas negras | Característica Bonita: Es el felino más grande del mundo\n"
                + "Nombre: Delfín | Especie: Tursiops truncatus | Característica: Nada muy rápido | Característica Bonita: Se comunica con silbidos únicos\n"
                + "Nombre: Jirafa | Especie: Giraffa camelopardalis | Característica: Cuello muy largo | Característica Bonita: Es el animal terrestre más alto\n"
                + "Nombre: Chimpancé | Especie: Pan troglodytes | Característica: Muy juguetón | Característica Bonita: Comparte el 98% del ADN humano\n"
                + "Nombre: Oso pardo | Especie: Ursus arctos | Característica: Pelaje espeso | Característica Bonita: Puede correr hasta 50 km/h\n"
                + "Nombre: Cebra | Especie: Equus quagga | Característica: Rayas blancas y negras | Característica Bonita: Cada cebra tiene un patrón único de rayas\n"
                + "Nombre: Canguro rojo | Especie: Macropus rufus | Característica: Salta muy alto | Característica Bonita: Puede saltar hasta 9 metros de largo\n"
                + "Nombre: Panda gigante | Especie: Ailuropoda melanoleuca | Característica: Come bambú todo el día | Característica Bonita: Come hasta 12 horas al día\n";
    }

    public void mostrarAnimales(int cantidad) {

        String[] listaAnimales = AnimalesZoo().split("\n");

        if (cantidad > listaAnimales.length) {
            cantidad = listaAnimales.length;
        }

        for (int i = 0; i < cantidad; i++) {
            System.out.println(listaAnimales[i]);
        }
    }


}
