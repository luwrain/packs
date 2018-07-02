/*
   Copyright 2012-2018 Michael Pozhidaev <michael.pozhidaev@gmail.com>

   This file is part of LUWRAIN.

   LUWRAIN is free software; you can redistribute it and/or
   modify it under the terms of the GNU General Public
   License as published by the Free Software Foundation; either
   version 3 of the License, or (at your option) any later version.

   LUWRAIN is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
   General Public License for more details.
*/

package org.luwrain.packs;

import org.luwrain.core.*;

final class IndexWorker implements Worker
{
    static private final String NAME = "luwrain.packs.index";

    @Override public void run()
    {
    }

    @Override public String getExtObjName()
    {
	return NAME;
		}

    @Override public int getLaunchPeriod()
    {
	return 60 * 60;
    }

    @Override public int getFirstLaunchDelay()
    {
	return 20;
		}
}
