/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico1;

/**
 *
 * @author juanj
 */
public class Computadora {
        private int RAM;
        private String CPU;
        private boolean video;
        private int disco;
        //Alumno dueño;

        public Computadora(int RAM, String CPU, boolean video, int disco) {
            this.RAM = RAM;
            this.CPU = CPU;
            this.video = video;
            this.disco = disco;
        }
        public Computadora(){}

        public void setRAM(int RAM) {
            this.RAM = RAM;
        }
        public boolean isVideo() {
            return video;
        }

        public void setVideo(boolean video) {
            this.video = video;
        }

        public int getDisco() {
            return disco;
        }

        public void setDisco(int disco) {
            this.disco = disco;
        }

        
        public void setCPU(String CPU){
            this.CPU = CPU;
        }
        public String getCPU(){
            return CPU;
        }
       
}
