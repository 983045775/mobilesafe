package com.aliyouyouzi.mobilesafe.test;import com.aliyouyouzi.mobilesafe.db.BlackSafeDao;import android.test.AndroidTestCase;public class BlackSafeTest extends AndroidTestCase {	public void add() {		BlackSafeDao dao = new BlackSafeDao(getContext());		for (int x = 0; x < 100; x++) {			dao.add("139191901" + x, 2 + "");		}	}	public void find() {		BlackSafeDao dao = new BlackSafeDao(getContext());		int find = dao.find("13919190180");		assertEquals(1, find);	}	public void delete() {		BlackSafeDao dao = new BlackSafeDao(getContext());		boolean delete = dao.delete("13919190180");		assertEquals(delete, true);	}	public void updata() {		BlackSafeDao dao = new BlackSafeDao(getContext());		boolean updata = dao.updata("13919190180", "0");		assertEquals(updata, true);	}}