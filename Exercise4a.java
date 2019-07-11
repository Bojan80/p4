package p4;

import javax.swing.JOptionPane;
import arrays.IntegerArrays;

public class Exercise4a {
	public static int[] parseString( String str ) {
		String[] nbr = str.split( "," ); // Ex: str√§ngen "13,4,7,9" blir arrayen {"13","4","7","9"}
		int[] res = new int[ nbr.length ];
		for( int i = 0; i < nbr.length; i++ ) {
			res[ i ] = Integer.parseInt( nbr[i] );
		}
		return res;
	}
	
    public static void main(String[] args) {
    	String message = "";
        String str = JOptionPane.showInputDialog( null, "Mata in heltal separerade med komma-tecken");
        int[] test1 = parseString( str );
        int[] test2;
        
        message += "Vektor: " + IntegerArrays.toString( test1 ) + "\n";
        message += "Stˆrst: " + IntegerArrays.max( test1 ) + "\n";
        message += "Minst: " + IntegerArrays.min( test1 ) + "\n";
        message += "Summa: " + IntegerArrays.sum( test1 ) + "\n";
        message += "Medelv‰rde: " + String.format( "%1.2f", IntegerArrays.average( test1 ) ) + "\n";
        message += "Range: " + IntegerArrays.range(test1) + "\n";
        test2 = IntegerArrays.copy(test1);
        message += "test2: " + IntegerArrays.toString( test2 ) + "\n";
        IntegerArrays.sortAsc(test1);
        IntegerArrays.sortDesc(test2);
        message += "test1: " + IntegerArrays.toString( test1 ) + "\n";
        message += "test2: " + IntegerArrays.toString( test2 ) + "\n";
        JOptionPane.showMessageDialog( null, message );
    }
}
