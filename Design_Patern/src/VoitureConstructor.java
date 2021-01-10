public class VoitureConstructor {
        // on instancie ici toutes nos voitures 
        public static VoitureDuChampionnatDeFormuleUn getTypeCar(ConstructeurAutmobile type ){
            if (ConstructeurAutmobile.Renault.equals(type))
                return new Renault();
            else if (ConstructeurAutmobile.Ferrari.equals(type))
                return new Ferrari();
            else if (ConstructeurAutmobile.Mercedes.equals(type))
                return new Mercedes();
            else 
                throw new IllegalArgumentException();
        }
}