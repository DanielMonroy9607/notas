public class notas{
  import JOptionPane;
    public static void main(String[] args) {
        //variables del sistema
        String nombre_profesor,nombre_estudiante,mencion,estado,emoji;
        int edad,curso,enviar_emoji;
        double nota_final,nota1,nota2,nota3,nota4;
        
        //asignacion de vaores del sistema 
        
        nombre_profesor = JOptionPane.showInputDialog(null,"ingrese el nombre del profesor por favor: ","Nombre del profesor",-1);
        JOptionPane.showMessageDialog(null,"bienvenido al sitio web de colegio IED profesor "+nombre_profesor,"Bienvenido",1);
        nombre_estudiante = JOptionPane.showInputDialog(null,"ingrese el nombre del estudiante por favor: ","Nombre del estudiante",-1);
        edad = Integer.parseInt(JOptionPane.showInputDialog(null,"por favor digite la edad del estudiante: ","Edad",1));
        curso = Integer.parseInt(JOptionPane.showInputDialog(null,"por favor digite la curso del estudiante: ","Curso",1));
        nota1 = Integer.parseInt(JOptionPane.showInputDialog(null,"por favor digite la primera nota del estudiante: ","Nota",1));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog(null,"por favor digite la segunda nota del estudiante: ","Nota",1));
        nota3 = Integer.parseInt(JOptionPane.showInputDialog(null,"por favor digite la tercera nota del estudiante: ","Nota",1));
        nota4 = Integer.parseInt(JOptionPane.showInputDialog(null,"por favor digite la cuarta nota del estudiante: ","Nota",1));
        nota_final =(nota1+nota2+nota3+nota4)/4;
        enviar_emoji = Integer.parseInt(JOptionPane.showInputDialog(null,"deseas enviar un emoji? 1=feliz  2=triste ","Emoji",1));
        
        //ciclos del sistema
        
        if (nota_final < 3)
        {
        estado = ("REPROBADO");
        }
        else if (nota_final > 3)
        {
        estado = ("APROBADO");
        }
        else
        {
        estado=("usted no esta inscrito");
        }

        if (nota_final <= 2.9)
        {
        mencion = ("mejor dediquese al vive100");
        }
        else if (nota_final >= 4.5)
        {
        mencion = ("felicidades, recibe mencion de honor");
        }
        else {
        mencion = ("no recibe mencion de honor");
        }

        if (enviar_emoji == 1) {
        emoji = ":)";
        }
        else if (enviar_emoji == 2) {
        emoji = ":(";
        }
        else {
        emoji = "no hay emoji ._.";
        }

       JOptionPane.showMessageDialog(null,"hola "+nombre_estudiante+" del curso "+curso+"\n tu edad es "+edad+"\n tu nota final es " +nota_final + "\n tu estado es "+estado +" \n"+ mencion+"\n tu profesor "+nombre_profesor+" esta "+emoji,"Informacion",2);

        
        
    }     
        
    }
         
        

        
        