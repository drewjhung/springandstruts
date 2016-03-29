package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.service.IIndexService;
public class IndexService implements IIndexService {

	public String test() {
		return "From service";
	}

	public List<String> listAllAlbums() {
		List<String> albums = new ArrayList<String>();
		albums.add("X");
		albums.add("F.A.M.E");
		albums.add("AYO");
		albums.add("Royalty");
		return albums;
	}

	
}
