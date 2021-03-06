package com.zyyj.service;

import java.util.List;

public class ServiceUtil {
	
	public static String getNextId(String max_id, String prefix) {          // 为各种实体生成规范的ID
		String next_id = max_id;
		int next = Integer.valueOf(max_id.substring(prefix.length() + 1)) + 1;
		if(next < 10) {
			next_id = prefix + "_00" + next;
		}
		else if(next < 100) {
			next_id = prefix + "_0" + next;
		}
		else {
			next_id = prefix + "_" + next;
		}
		return next_id;
	}
	
}
