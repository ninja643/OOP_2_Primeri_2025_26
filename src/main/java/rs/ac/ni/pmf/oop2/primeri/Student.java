package rs.ac.ni.pmf.oop2.primeri;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Student {
    private int brojIndeksa;
    private String ime;
    private String prezime;
    private String jmbg;
    private String email;
    private String telefon;
    private String adresa;
    private String smer;
    private String godinaStudija;
}
