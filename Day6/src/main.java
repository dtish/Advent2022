

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		

		String str = "Xpwjwljjjvqjqjzqjqvvpgvpggmdgdrrzmzfzmzffzbbjnbjnjddsdpsdsgsgvsgvgmmzvvpspvspsdsbsbffhwhlwwzllftfhhrfrsrrnnngqgtglgfgtffnssrspsqppdvdtdwwpfpzffnpnddvsswjswjjhdjdrjrwwfpwfpfjppzwzvzpzrznzgzcgzgpgfpffwggtbbhsslzztpplltdtqtctrrszrzszpsprptrtgrtrzrvzrvzrrsfsbswsvvbdbjjgljjwqwgqwwtmwwnbbzdbdwwsnntztstbssnjssjmmldmmrrnfrfgfbbszzzlrrwzwtwwbrwrlwrwzwmwqmwwtqwwtvvdqdtqqfnfjnjsnslltcllvmmdmttvsszrsrwssdmdttdmdrmrsrvrllrhlltmlmlzmlzzhvhbbflfsslclpcczmmcjmjccpgprrgnrrzqqmgqggfvgffbsfsbfbttrgtrtptgtjtnnfbfmmrrcmcwwbbmwmvvvtppslsvvlsvswwztwztzqqpggdccmlldlplggrgddlrddvwvsswllsffbllsbbslshslswsllnqlqrqqpmqmtmqtmqtmmbwmbbzdbzbttvptvpvgpvggblbsspgppvmvsswfssfdfrdffpbfpprmrssmbbmggszslzlslblsldsldssjjsrjjjdfdjdtdmdnnncddpfddrjdjvjfvjffftmfmqqqqqfjjhssbzbbfjjmmzgzllphlplhlplfpfnpnsppjjqsshpssjdjzzwvvjfvfnfttmtbbgtgbbdpbbjppzcpzzvcvpvvdcvvcfvvfsvsccmhhrwrjjsrjrvrfvfwvvtftzztlztlthlhrhnnlpnllnmnfmffzpffhlhbhqbhqhfhwwlglnndgdwdswwgtwgtgsttpbprpqpnnbsnbsnszzrszsqzqlqggvhghrrvprvvvqnnmmrwrbrrmttwrrlmrrrddmsddbhdhdjhdhrhffppphghvvtztptjjlppcqcscjscstsmsbspsgpgqgmmndmdvvpnpnrrjtrthhtzzjlzzrwzrrfsfflrrmffhlhglhhhhvwwttlcttbqqzzbzzzbhbsscqqjggqpggqffbttrfrjjjqmmpttlvvqlvqqqtgtrtcrcbcnbbhfbfhbhqbhqbqvbvqvrqvvgttqwqpwqwnnpgngpphjppztptnnrssjqqrplzrvmwmbrbgbnggvzpmphqsrjrdhtslpmmwrhgcndwtbsbrfmsplzqswsnmrwdwwhzmpbqcmjfsmnwqnjmvdczhgmtfjwnjfdllfzdwpwgclpbdqtqnqqqvpthltznfzshhgrwwqclpplmdwtpjszrdwwzfbljcjmqmhptfhvcbvgfjfftbsfglwqldphdzzgcmvtsbhlsdncfjcsqrqrtdhttcwzlbqhvgppbrjfzdzwzprwpfflmdspcmqcbdhsvwjswwbzwnqrshbqfnmtdzrsrjgqngntllcgwjnmjqvtgwvttfqrcjlhbpcrszlngfmdgzprcdttgbjpcdzbhtdghpltcbvcddnslhqthfvzjtspqlzhdprhgtrlqqgtsqwwjqthgdwfgdfzhrnrwlrpqmgqltgldpjqgjzvngrphclbfftnwfnfvsvhftthptqfnvlftdpdhcrjdhfwtpwwvsblgntdwcpnsprhnpjtjsprdrdjwlhnmnzmmjmcdfsctzgmlqwwrwztjndqgpqrvdgplcnntqhfjlzjszpdwnvlwdzzgpzvplglgrmsjgjpmsrdsgzlfblgbgszgdtgsggqvhzmnfcnvlnzrfpqphctlcqccqzslmlsbbztnpncqpgscgdmmsgfwqrzpmbqrmfqsnnggswhmgmtmgdmhwthbgbdsrtnsrvdfdhlhhczgdsdqnpsgjzpbnsmgrvsfdjlhgjfjjwqnrnrbzdzcjlstclpqfnrflgnzbdbzvbjcbgqrrrlfcpgptcghhqqfsvsgljvjhdgdgcjtnrqsctmwhzbmbrfrsvndhfrtwlfgvqcbjsvttrctfshrggdvgbhthnwbwqglrvfbsqnbhdwgzhbccjnlhtcbjlpgrvttthnwvvspnzvqhjvmtwshcstdjhfqhqcgvwqwwwwrfdmnjhldsrhgmtjddsghdmdrpczbcjflmbhszctmvdttfrrqqpwslhvqbjlsrjdjrcqjrhwgjlsqmvdpvvvlbzwtthptpsggddcbqbhrvrpdtncvgndclhpngzgfqdqgwwbrjltjtqbpbtbzjmfmnjnlqmtzvdqdwqhbgptplrgdsfpjzfrpdcdsznwffpnzsmpqjfbcpddqjgfqhqbwsfmzgstfdnzhphhvgbzvjrlmqmrznpctftcmbtdpbfbfpfpjtjhbcrrssnlvtrtnzvwtjwplclpqndpfstjmghmzsllhntprtjwlppjnjgjzlvlcbcwjvrjqjhfnnpmwlpngwtvvbcllmjzqfrwvtvsrvbcpfwcdfwmdwvztwtbrgvlvmfjmpzdzmfbcmrsqfwqjfjfrgmnblnzfzcvgwllvmqfmdlqqgvvjrptlrjcwphvchwhmtwhnlnjprqhlrhmdfptvpshjbzrhptvnqfvjfjcnglnbfhbwghqqjbqzdthjwqzznwfsmqmbsqnwrdrrwjgzjdmgtsqswlqcpshdmcfjttpszqmsjhgfsrvgchgwzbqgbdqhmbndmnmwjsnjjvmtpprbtlwzpvfdnbtjnzzvlwndgbhgwbpllvfghwvwjmlpnzfjzjwwmtvbbfndppbqwhjlwgtswmgffddbhnwqljvgcvfnqmzgvfmjwsbcrpgtcpchlblccgpgpmddsjsfwbnvnsfttnsqjshchdztvsbjwsfmszfwpwsmgzvvcfddtczvvmnhgjffrsfqzfmphpfblmwgcbbrjqzdztzzzjhqmjzrgmwgrqdfqdbjsgwfndqgnmdvjlwdtjpjtpcqlhtcfvnmzjswldrbqjpmrlqwhvnqjshbqqvzwwsdjmspgbvrgvpjjnwsvnvnppvlnqbdllfczjjftpnlrjfvcwgwbdmldtcnczqzcptjjrgglnnbgmrdffgmnnwvjzwbgcncnhzmthswrdsrhchprrrrnhjfnzmsgfjltqzmttvhslnsgcjfgqwcsddfstcstspcpdbznvdrnqhwqsfgqtdbtwspfswfjbzgtqjpvzfhfdblszblmgrmmlwvnwwdsdjjvrsfjfjltcsfccplftvpltqshgnpnqlqcglrhvzldptspnbvjcchnnvzvbbqnnnbnggrhpcgqtgnjdqplswtblgtwqzmltjjhpdttgbcvhfrsdcgjzswvtbbhrpnzmrjhgznbdpqgqdhwcnmgflpdtbzdbvzvslbvvwdpcnwjtvjhgncnljfwlrvqgdrjhdcprsqjrmwwlcrrvsjtlmqmjtcbqwcbmgnvfshdgmmfffzvwjphjfspvdzjsqdlgqfdjwwshdcssqvvgdcvvtmwlfjdvtfllrvltmrsgpdtdqsfjpcvjnqszpnbqqlnpdvhtswbgwnpcqpgzqwlgsmlnlngcdmqhchcdgfmrhfwwrgrrdrhcsbbcrhghdjrcsltchqghvmbvbbpqzqbgwmqrgwchhbvdsqbqrfcbzwjrlqtnmghtjbtjdpngcjzswfmjfphjnftbhdgvwjsvqfbsfgqhfbcrgrsppsvbnpwlhsdrffcmmgzpjfsvllcrbtwrwddthfjvjndzfzbcmglhbzpzwwbtzdpdlwrnbzqjbqwpbdlwfddbtzjhqshmcghqfcrzrmrtmqwpqhvqzbfwhbssgjcmzqcpvnntbpfqwhbmtjdtbtrrdhsvzqjltdshtlvwwmlbdzlvjhmtppnbqcjnncpslcggsjbrmzvdgqzclwszgzfqthndnjfjrznlmmtjwwhnzvhnjncccpczrftvhtdhjbzvwvlgqhdnfqdqrhctfffpcnqzdrgqqzcczdjvpzqfgfcpjzqhbwshsqhvqzpsb";
		int strLen = str.length();
		
		ArrayList<Character> buffer = new ArrayList<Character>();
		
		//populate initial buffer
		for(int i=0; i<14; i++) {
			char newChar = str.charAt(i);
			buffer.add(newChar); 
			System.out.println(buffer);
			
		}
				
		
		int bufLen = buffer.size();
		//move buffer up one char
		for(int l=13; l<strLen; l++) {
			buffer.remove(bufLen-14);
			buffer.add(str.charAt(l+1));
			System.out.println(buffer);
				bufLen = buffer.size();
				//check for repeating chars in buffer
				boolean somFlag = false;
				int dupCount = 0;
				for(int j=0; j<bufLen; j++) {
					
					for(int k=j; k<bufLen; k++) {
						if(buffer.get(j) == buffer.get(k) && j!=k) {
//											System.out.println("DUPLICATES: "+buffer.get(j)+" "+buffer.get(k));
							dupCount++;
							break;
						}
						else if(buffer.get(j) != buffer.get(k) && j!=k) {
		//					System.out.println("Not Duplicates");
							
						}
						
					}
					
					
//									System.out.println("Duplicates: "+dupCount);
					if(dupCount>0) {
						somFlag = false;
						
					}
//									System.out.println("SoM: "+somFlag);
					
					
				}
								
			System.out.println("Characters checked: "+(l+1));
			if(dupCount == 0) {
				somFlag = true;
				System.out.println("SoM: "+somFlag);
				System.out.println("Characters checked: "+(l+1));
				break;
			}
		
		}
		
		
		
		
		
		LocalDate dateStamp = LocalDate.now();
		LocalTime timeStamp = LocalTime.now();
		long endTime   = System.nanoTime();
		double runtime = (endTime - startTime)/(Math.pow(10,9));
		System.out.println("\nFinished at:" + dateStamp+" "+timeStamp);
		System.out.println("Runtime: "+ runtime+ " sec");
		
	}

}
