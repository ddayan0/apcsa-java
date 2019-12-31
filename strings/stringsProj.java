// Dennis Dayan
// Mr. Watson
// AP Comp Sci A
// 17 December 2019 (so far)
// stringsProj.java

// the new age must come
// java must be dead soon
// we want our functions back

// TODO Mini Proj #4 (12 pts)
//        Format Name
//        Convert a name in the format LAST, FIRST to FIRST LAST
//        Make sure to handle spaces and apostrophes
//        Eg: von Neumann, John => John von Neumann
//        Eg: O'Reilly, Bill => Bill O'Reilly
// DONE!



// TODO Mini Proj #6 (12 pts)
//        How Many Multiples?
//        Determine how many letters are found multiple times in a String passed as an argument
//        Print to the console a single instance of a letter that is contained in a String two or more times
//        Eg: “Hello World”
//        l appears 3 times
//        o appears 2 times
//        If there are no multiples, print an error message to the user
// IN PROGRESS

// TODO Mini Proj #5 (12 pts)
//        Reverse Each
//        Reverse each word of a small paragraph provided as a parameter
//        This must not reverse the entire paragraph
//        You may use ONE method not on the Strings Slides, but it must be a String method (Choose wisely)
//        Must handle punctuation, special characters, and spacing appropriately
//        Eg: “The quick brown fox jumped over the lazy dog!”
//        ehT kciuq nworb xof depmuj revo eht yza'l !god

// ok first of all, why do we have to do all the hard ones for full credit?
// i mean ok, i guess you want to challenge us and motivate us to challenge ourselves
// but
// thats just a little mean


import java.util.Arrays;
import java.util.regex.*;

// Python > C > Java
public class stringsProj {

    static void line(){ //line function for organization
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_"); //ooooo fancy
    } //end line()

    static void formatName(String target){ //method for miniProj #4
        int commaindex = target.indexOf(",");
        String lastname = target.substring(0, commaindex);
        String firstname = target.substring(commaindex + 2);
        System.out.println(firstname + " " + lastname);
    }//end formatName()

    static void howManyMultiples(String target){ //method for miniProj #6
	    	String newTarg = target.toLowerCase();
		Pattern a = Pattern.compile("a");
		Matcher amatch = a.matcher(newTarg);
		int acount = 0;
		while (amatch.find()){
			acount++;
		}
		if(acount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("A is found " + acount + " Times");
		}
		Pattern b = Pattern.compile("b");
		Matcher bmatch = b.matcher(newTarg);
		int bcount = 0;
		while (bmatch.find()){
			bcount++;
		}
		if(bcount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("B is found " + bcount + " Times");
		}
		Pattern c = Pattern.compile("c");
		Matcher cmatch = c.matcher(newTarg);
		int ccount = 0;
		while (cmatch.find()){
			ccount++;
		}
		if(ccount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("C is found " + ccount + " Times");
		}
		Pattern d = Pattern.compile("d");
		Matcher dmatch = d.matcher(newTarg);
		int dcount = 0;
		while (dmatch.find()){
			dcount++;
		}
		if(dcount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("D is found " + dcount + " Times");
		}
		Pattern e = Pattern.compile("e");
		Matcher ematch = e.matcher(newTarg);
		int ecount = 0;
		while (ematch.find()){
			ecount++;
		}
		if(ecount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("E is found " + ecount + " Times");
		}
		Pattern f = Pattern.compile("f");
		Matcher fmatch = f.matcher(newTarg);
		int fcount = 0;
		while (fmatch.find()){
			fcount++;
		}
		if(fcount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("F is found " + fcount + " Times");
		}
		Pattern g = Pattern.compile("g");
		Matcher gmatch = g.matcher(newTarg);
		int gcount = 0;
		while (gmatch.find()){
			gcount++;
		}
		if(gcount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("G is found " + gcount + " Times");
		}
		Pattern h = Pattern.compile("h");
		Matcher hmatch = h.matcher(newTarg);
		int hcount = 0;
		while (hmatch.find()){
			hcount++;
		}
		if(hcount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("H is found " + hcount + " Times");
		}
		Pattern i = Pattern.compile("i");
		Matcher imatch = i.matcher(newTarg);
		int icount = 0;
		while (imatch.find()){
			icount++;
		}
		if(icount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("I is found " + icount + " Times");
		}
		Pattern j = Pattern.compile("j");
		Matcher jmatch = j.matcher(newTarg);
		int jcount = 0;
		while (jmatch.find()){
			jcount++;
		}
		if(jcount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("J is found " + jcount + " Times");
		}
		Pattern k = Pattern.compile("k");
		Matcher kmatch = k.matcher(newTarg);
		int kcount = 0;
		while (kmatch.find()){
			kcount++;
		}
		if(kcount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("K is found " + kcount + " Times");
		}
		Pattern l = Pattern.compile("l");
		Matcher lmatch = l.matcher(newTarg);
		int lcount = 0;
		while (lmatch.find()){
			lcount++;
		}
		if(lcount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("L is found " + lcount + " Times");
		}
		Pattern m = Pattern.compile("m");
		Matcher mmatch = m.matcher(newTarg);
		int mcount = 0;
		while (mmatch.find()){
			mcount++;
		}
		if(mcount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("M is found " + mcount + " Times");
		}
		Pattern n = Pattern.compile("n");
		Matcher nmatch = n.matcher(newTarg);
		int ncount = 0;
		while (nmatch.find()){
			ncount++;
		}
		if(ncount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("N is found " + ncount + " Times");
		}
		Pattern o = Pattern.compile("o");
		Matcher omatch = o.matcher(newTarg);
		int ocount = 0;
		while (omatch.find()){
			ocount++;
		}
		if(ocount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("O is found " + ocount + " Times");
		}
		Pattern p = Pattern.compile("p");
		Matcher pmatch = p.matcher(target);
		int pcount = 0;
		while (pmatch.find()){
			pcount++;
		}
		if(pcount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("P is found " + pcount + " Times");
		}
		Pattern q = Pattern.compile("q");
		Matcher qmatch = q.matcher(newTarg);
		int qcount = 0;
		while (qmatch.find()){
			qcount++;
		}
		if(qcount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("Q is found " + qcount + " Times");
		}
		Pattern r = Pattern.compile("r");
		Matcher rmatch = r.matcher(newTarg);
		int rcount = 0;
		while (rmatch.find()){
			rcount++;
		}
		if(rcount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("R is found " + rcount + " Times");
		}
		Pattern s = Pattern.compile("s");
		Matcher smatch = s.matcher(newTarg);
		int scount = 0;
		while (smatch.find()){
			scount++;
		}
		if(scount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("S is found " + scount + " Times");
		}
		Pattern t = Pattern.compile("t");
		Matcher tmatch = t.matcher(newTarg);
		int tcount = 0;
		while (tmatch.find()){
			tcount++;
		}
		if(tcount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("T is found " + tcount + " Times");
		}
		Pattern u = Pattern.compile("u");
		Matcher umatch = u.matcher(newTarg);
		int ucount = 0;
		while (umatch.find()){
			ucount++;
		}
		if(ucount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("U is found " + ucount + " Times");
		}
		Pattern v = Pattern.compile("v");
		Matcher vmatch = v.matcher(newTarg);
		int vcount = 0;
		while (vmatch.find()){
			vcount++;
		}
		if(vcount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("V is found " + vcount + " Times");
		}
		Pattern w = Pattern.compile("w");
		Matcher wmatch = w.matcher(newTarg);
		int wcount = 0;
		while (wmatch.find()){
			wcount++;
		}
		if(wcount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("W is found " + wcount + " Times");
		}
		Pattern x = Pattern.compile("x");
		Matcher xmatch = x.matcher(newTarg);
		int xcount = 0;
		while (xmatch.find()){
			xcount++;
		}
		if(xcount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("x is found " + xcount + " Times");
		}
		Pattern y = Pattern.compile("y");
		Matcher ymatch = y.matcher(newTarg);
		int ycount = 0;
		while (ymatch.find()){
			ycount++;
		}
		if(ycount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("Y is found " + ycount + " Times");
		}
		Pattern z = Pattern.compile("z");
		Matcher zmatch = z.matcher(newTarg);
		int zcount = 0;
		while (zmatch.find()){
			zcount++;
		}
		if(zcount <= 1){
			System.out.println("");
		}
		else{
			System.out.println("Z is found " + zcount + " Times");
		}
    }//end howManyMultiples()

    static void reverseEach(String target){ //method for miniProj #5
	String[] words = target.split(" ");
	String revStr = "";
	for (int i = 0; i < words.length; i++){
		String word = words[i];
		String revWrd = "";
		for(int x = word.length()-1; x >= 0; x--){
			revWrd = revWrd + word.charAt(x);
		}
		revStr = revStr + revWrd + " ";
		int targlen = target.length()+1;
		int strlen = revStr.length();
		if(targlen == strlen){
			System.out.println(revStr);
		
		}		
	    }
    }//end reverseEach()

    //below are arrays useful to the program itself, these are not made to satisfy specific requirements
//    static void stringtoArr(String target){
//        for(int i = 0; i < target.length(); i++){
//            String [] genArray = new String[i];
//        }
//    }

    public static void main(String[] args) { //main method (obviously)
        line(); // calls line function
        formatName("O'Reilly, Bill"); //formatName function
        line();
        howManyMultiples("Impossible");
	line();
	reverseEach("The quick brown fox jumped over the lazy dog!");
	line();

    } //end psvm()





}
