class Temperaturer {
	private int dager;
	private int[][] temperatur; 
	
	public Temperaturer() {
		dager = 30;
		temperatur = new int[dager][24];
	}
	
	public Temperaturer(int dager) {
		this.dager = dager;
		temperatur = new int[dager][24];
	}
	
	public void setTemp(int dag, int time, int temp) {
		temperatur[dag][time] = temp;
	}
	
	public int getTempTime(int time) {
		int middelTemp = 0;
		for (int i = 0; i < dager; i++) {
			middelTemp += temperatur[i][time - 1];
		}
		middelTemp /= dager;
		return middelTemp;
	}
	
	public int getTempDag(int dag) {
		int middelTemp = 0;
		for (int i = 0; i < 24; i++) {
			middelTemp += temperatur[dag - 1][i];
		}
		middelTemp /= 24;
		return middelTemp;
	}
	
	public int getTempManed() {
		int middelTemp = 0;
		for (int i = 1; i < dager + 1; i++) {
			middelTemp += getTempDag(i);
		}
		middelTemp /= dager;
		return middelTemp;
	}
	
	public int tempKategori(int kategoriNum) {
		int[] kategori = new int[5];
		
		for (int i = 1; i < dager + 1; i++) {
			if (getTempDag(i) < -5) {
				kategori[0]++;
			} else if (getTempDag(i) < 0) {
				kategori[1]++;
			} else if (getTempDag(i) < 5) {
				kategori[2]++;
			} else if (getTempDag(i) < 10) {
				kategori[3]++;
			} else {
				kategori[4]++;
			}
		}
		
		return kategori[kategoriNum];
	}
}