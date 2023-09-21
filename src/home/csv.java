package home;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class csv {

	public static void main(String[] args) throws IOException {
		CSVWriter writer = new CSVWriter(new FileWriter("briqfolder\\webtable_21-09-2023.csv"));
		
		String[] headings = {"Lorem", "lpsum" , "Dolor","Sit","Amet","Diceret"};
		String[] data1 = {"luvaret0" ,"Apeirian0","Adipisci0","Definiebas0","Consequuntur0","Phaedrum0"};
		String[] data2 = {"luvaret1" ,"Apeirian1","Adipisci1","Definiebas1","Consequuntur1","Phaedrum1"};
		String[] data3 = {"luvaret2" ,"Apeirian2","Adipisci2","Definiebas2","Consequuntur2","Phaedrum2"};
		String[] data4 = {"luvaret3" ,"Apeirian3","Adipisci3","Definiebas3","Consequuntur3","Phaedrum3"};
		String[] data5 = {"luvaret4" ,"Apeirian4","Adipisci4","Definiebas4","Consequuntur4","Phaedrum4"};
		String[] data6 = {"luvaret5" ,"Apeirian5","Adipisci5","Definiebas5","Consequuntur5","Phaedrum5"};
		String[] data7 = {"luvaret6" ,"Apeirian6","Adipisci6","Definiebas6","Consequuntur6","Phaedrum6"};
		String[] data8 = {"luvaret7" ,"Apeirian7","Adipisci7","Definiebas7","Consequuntur7","Phaedrum7"};
		String[] data9 = {"luvaret8" ,"Apeirian8","Adipisci8","Definiebas8","Consequuntur8","Phaedrum8"};
		String[] data10 = {"luvaret9","Apeirian9","Adipisci9","Definiebas9","Consequuntur9","Phaedrum9"};
		
		List<String[]> list = new ArrayList<>();
		
		list.add(headings);
		list.add(data1);
		list.add(data2);
		list.add(data3);
		list.add(data4);
		list.add(data5);
		list.add(data6);
		list.add(data7);
		list.add(data8);
		list.add(data9);
		list.add(data10);
		
		writer.writeAll(list);
		writer.flush();
		
		
	}

}
