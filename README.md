![image](https://github.com/GongShengyue/MSFS-MapNG-Server/blob/main/icon_small%20-github.png)<img src="https://github.com/GongShengyue/MSFS-MapNG/blob/main/xuanchuan1.png" width="250px">

<img src="https://github.com/GongShengyue/MSFS-MapNG/blob/main/xuanchuan3.png" width="500px">



# About

MSFS MAP NG is the next generation companion map of Microsoft Flight Simulator on the mobile device.

##### Features of the app:

- smooth map,full 120fps animation,may be the  smoothest similar app,even smoother than the MFD in your game. After all,most of the smart phones support high refresh rate.
- **9** different map styles(satellite,outdoor,street...)
- Terrain display(dynamic change)
- simple direct to function
- No server needed,just config when the first time you use it! After that when the next time you want to use this app,the only thing you need to do is to open your phone and click a connect button.you don't need to quit the game to open server program or anything else. 


# Installing

1.Click here to download the app 

<a href='https://play.google.com/store/apps/details?id=com.gsy.msfs_mapbox_kotlin&pcampaignid=pcampaignidMKT-Other-global-all-co-prtnr-py-PartBadge-Mar2515-1'><img alt='Get it on Google Play'  width='250' src='https://play.google.com/intl/en_us/badges/static/images/badges/en_badge_web_generic.png'/></a>

2.Get your WLAN ip address

3.Find the SimConnect.xml in the Microsoft files, usually somewhere here:**C:\Users\[user name]\AppData\Local\Packages\Microsoft.FlightSimulator_8wekyb3d8bbwe\LocalCache** Add a new connection to that xml file:

```
<SimConnect.Comm>
<Descr>Global IP Port</Descr>
<Disabled>False</Disabled>
<Protocol>IPv4</Protocol>
<Scope>global</Scope>
<Address>192.168.0.66</Address> !!Set the IP of your gaming machine
<MaxClients>64</MaxClients>
<Port>7421</Port> 
<MaxRecvSize>4096</MaxRecvSize>
<DisableNagle>False</DisableNagle>
</SimConnect.Comm>
```

4.Start Microsoft Flight Simulator 2020

5.Open the Msfs Map NG appication on your phone and enter your ip address(*make sure your phone and computer connect to same network*!)

6.Click CONNECT button and enjoy your fly!

# Note

The app does not work with XBOX msfs. Only  PC game is supported.

# Features under development

- [x] add airspace and other aviation info on the map
- [ ] airport search and 3D airport preview
- [ ] Altitude profile display
- [ ] import flight plan from simbrief
