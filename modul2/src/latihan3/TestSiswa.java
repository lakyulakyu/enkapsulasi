/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author hp
 */
public class TestSiswa {
    public static void main(String[] args) {
               EncapSiswa encapsiswa = new EncapSiswa();
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("badut" +"\n");
        siswa.setAge(23);
        siswa.setAddress("Malang" +"\n");

        System.out.println("nama: " + siswa.getName()
                + " alamat " + siswa.getAddress() + " berumur " + siswa.getAge()
                + " tahun");  
    }
}
