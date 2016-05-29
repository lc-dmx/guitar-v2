package guitarshop.bll;

import guitarshop.dal.inventoryDal;
import guitarshop.entity.inventory;

public class inventoryBll {
	public static inventory inventory()//初始化inventory 获取所有吉他加载到inventory内
	{
		return inventoryDal.inventory();
	}

}
