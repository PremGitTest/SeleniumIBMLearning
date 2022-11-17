#create a class
class BrowserDetails:
    def _init_(self,remotename,remoteversion)->None:
        self.name=remotename
        self.version=remoteversion
    def browserInfo(self)->str:
        print(f'browser name is {self.name} and latest version is: {self.version}')
        return self.name
# create an object of class 
chrome_br = BrowserDetails()
chrome_br._init_("Chrome",106)
x = chrome_br.browserInfo()
print(x)  
#safari browser
safari_br=BrowserDetails()
safari_br._init_("Safari",107)
y=safari_br.browserInfo()
print(y)


