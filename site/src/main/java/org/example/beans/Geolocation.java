package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;

@HippoEssentialsGenerated(internalName = "myhippoproject:geolocation")
@Node(jcrType = "myhippoproject:geolocation")
public class Geolocation extends HippoDocument {
    @HippoEssentialsGenerated(internalName = "myhippoproject:latitude")
    public String getLatitude() {
        return getProperty("myhippoproject:latitude");
    }

    @HippoEssentialsGenerated(internalName = "myhippoproject:logitude")
    public String getLogitude() {
        return getProperty("myhippoproject:logitude");
    }
}
