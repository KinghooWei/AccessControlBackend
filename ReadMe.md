# 人脸考勤系统

## 数据库
* user 表
    
      功能：储存考勤系统用户数据
* person 表
       
      功能：储存被考勤的人员信息
      
* attendance 表
     
      功能：储存考勤记录
      
* unknown 表
     
      功能：储存未知人员出入记录



## 门禁接口
* url:\<ip>\/door/jsonApi 
 
       功能：通用的json api接口，采用json格式处理数据
    - door.person.getAll  
          
          功能：获取全部人员信息  
          上传数据：
          {
            "service":"door.person.getAll",
            "timestamp":"20191210175533"
          }  
          返回数据：
          {"resultCode":0,"personInfos":["潘春文, 201820115373, [-0.49648 -0.330953 1.23211 -0.505759 0.537886 -0.0665516 0.500479 0.478905 0.870428 0.88261 0.740188 1.24071 -0.335885 0.28988 1.42157 -0.221457 -0.902048 0.668386 -1.08183 -0.0972345 0.312176 0.251075 1.37819 0.449391 -0.0368312 -0.791028 0.348356 -0.938824 1.10677 -0.132403 0.0834157 1.01942 -0.859591 -0.259553 0.193174 0.224931 1.97352 0.0512651 0.0680096 0.0178263 -0.17112 0.383343 -0.721316 1.94561 0.230105 -0.166059 -0.534594 -0.681497 1.40479 -1.09306 -0.0409734 -0.234982 -1.41997 0.652131 -0.7136 1.39474 0.0456335 0.767614 0.346069 0.782467 -0.222686 -0.159353 -0.129869 0.159853 0.179403 0.061673 0.249648 0.158551 0.969262 -1.60325 -0.951341 0.15666 -0.250029 1.79037 1.0627 -1.62702 0.892727 -1.41903 0.314037 0.180742 0.243712 -0.00540689 -0.778665 0.117983 -0.917233 -0.525619 0.459288 -0.970291 -1.01052 -0.288075 0.912805 -1.71934 -0.440198 0.661201 -0.0606444 0.436972 -0.756061 0.223482 0.0832003 -0.900788 1.62249 -1.59523 -2.16509 1.4187 1.64681 0.620513 0.493762 -2.45105 -0.0836597 1.26268 0.041611 0.523813 0.125172 1.05896 -0.423728 -1.87518 0.439168 0.309365 -0.133673 -1.73953 0.308589 0.813268 0.284362 0.397349 0.0231427 0.309971 -0.403491 0.896574]","潘春武, 201820115374, [-0.49648 -0.330953 1.23211 -0.505759 0.537886 -0.0665516 0.500479 0.478905 0.870428 0.88261 0.740188 1.24071 -0.335885 0.28988 1.42157 -0.221457 -0.902048 0.668386 -1.08183 -0.0972345 0.312176 0.251075 1.37819 0.449391 -0.0368312 -0.791028 0.348356 -0.938824 1.10677 -0.132403 0.0834157 1.01942 -0.859591 -0.259553 0.193174 0.224931 1.97352 0.0512651 0.0680096 0.0178263 -0.17112 0.383343 -0.721316 1.94561 0.230105 -0.166059 -0.534594 -0.681497 1.40479 -1.09306 -0.0409734 -0.234982 -1.41997 0.652131 -0.7136 1.39474 0.0456335 0.767614 0.346069 0.782467 -0.222686 -0.159353 -0.129869 0.159853 0.179403 0.061673 0.249648 0.158551 0.969262 -1.60325 -0.951341 0.15666 -0.250029 1.79037 1.0627 -1.62702 0.892727 -1.41903 0.314037 0.180742 0.243712 -0.00540689 -0.778665 0.117983 -0.917233 -0.525619 0.459288 -0.970291 -1.01052 -0.288075 0.912805 -1.71934 -0.440198 0.661201 -0.0606444 0.436972 -0.756061 0.223482 0.0832003 -0.900788 1.62249 -1.59523 -2.16509 1.4187 1.64681 0.620513 0.493762 -2.45105 -0.0836597 1.26268 0.041611 0.523813 0.125172 1.05896 -0.423728 -1.87518 0.439168 0.309365 -0.133673 -1.73953 0.308589 0.813268 0.284362 0.397349 0.0231427 0.309971 -0.403491 0.896574]"],"message":"","timestamp":"20191219110308"}
              
    - door.attendance.enter  
          
          功能：上传考勤信息
          上传数据：
          {
          	"service":"door.attendance.enter",
          	"name":"潘春文",
          	"studentNum":"201820115373",
          	"enterTime":"20191219093500",
          	"timestamp":"20191219093500"
          }
          返回数据：
          {"resultCode":0,"message":"success to add enter message","timestamp":"20191219093622"}
          
* url:\<ip>\/door/multipartApi  
          
      功能：通用的json api接口，采用multipart/form-data格式处理数据；用来上传图片等文件
      参数："file"，新增人员的头像图片文件；"jsonMessage",json数据字符串
    
    - door.person.add  
              
          功能：新增人员信息  
          上传数据：
          file: xxx.jpg
          jsonMessage:
          {
            "service":"door.person.add",
            "timestamp":"20191223211900",
             "personName":"测试",
             "studentNum":"123456789"
          }
          返回数据：
          {"resultCode":0,"message":"success to add person: 测试","timestamp":"20191223214351"}
          
    - door.unknown.report  
                  
          功能：上报被拍摄到的未知人员  
          上传数据：
          file: xxx.jpg
          jsonMessage:
          {
            "service":"door.unknown.report",
            "timestamp":"20191223211900",
             "enterTime":"20191223211900"
          }
          返回数据：
          {"resultCode":0,"message":"success to add unknown in 20191223211900","timestamp":"20191223214731"}