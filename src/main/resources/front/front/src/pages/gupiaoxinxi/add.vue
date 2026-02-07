<template>
<div :style='{"width":"100%","padding":"30px 7% 40px","margin":"0px auto","position":"relative","background":"#fff"}'>
    <el-form
	  :style='{"border":"0px solid #eee","padding":"30px 0","alignItems":"flex-start","flexWrap":"wrap","background":"#fff","display":"flex","width":"100%","position":"relative"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="120px"
    >
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="股票代码" prop="gupiaodaima">
            <el-input v-model="ruleForm.gupiaodaima" 
                placeholder="股票代码" clearable :disabled=" false  ||ro.gupiaodaima"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="股票名称" prop="gupiaomingcheng">
            <el-input v-model="ruleForm.gupiaomingcheng" 
                placeholder="股票名称" clearable :disabled=" false  ||ro.gupiaomingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}'  label="股票类型" prop="gupiaoleixing">
            <el-select v-model="ruleForm.gupiaoleixing" placeholder="请选择股票类型" :disabled=" false  ||ro.gupiaoleixing" >
              <el-option
                  v-for="(item,index) in gupiaoleixingOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="历史最高价" prop="lishizuigaojia">
            <el-input v-model="ruleForm.lishizuigaojia" 
                placeholder="历史最高价" clearable :disabled=" false  ||ro.lishizuigaojia"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="历史最低价" prop="lishizuidijia">
            <el-input v-model="ruleForm.lishizuidijia" 
                placeholder="历史最低价" clearable :disabled=" false  ||ro.lishizuidijia"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="市净率" prop="shijinglv">
            <el-input v-model="ruleForm.shijinglv" 
                placeholder="市净率" clearable :disabled=" false  ||ro.shijinglv"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="市盈率" prop="shiyinglv">
            <el-input v-model="ruleForm.shiyinglv" 
                placeholder="市盈率" clearable :disabled=" false  ||ro.shiyinglv"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="市销率" prop="shixiaolv">
            <el-input v-model="ruleForm.shixiaolv" 
                placeholder="市销率" clearable :disabled=" false  ||ro.shixiaolv"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="总股本" prop="zongguben">
            <el-input v-model="ruleForm.zongguben" 
                placeholder="总股本" clearable :disabled=" false  ||ro.zongguben"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="总市值" prop="zongshizhi">
            <el-input v-model="ruleForm.zongshizhi" 
                placeholder="总市值" clearable :disabled=" false  ||ro.zongshizhi"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="流通股" prop="liutonggu">
            <el-input v-model="ruleForm.liutonggu" 
                placeholder="流通股" clearable :disabled=" false  ||ro.liutonggu"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="流通值" prop="liutongzhi">
            <el-input v-model="ruleForm.liutongzhi" 
                placeholder="流通值" clearable :disabled=" false  ||ro.liutongzhi"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="营业总收入" prop="yingyezongshouru">
            <el-input v-model="ruleForm.yingyezongshouru" 
                placeholder="营业总收入" clearable :disabled=" false  ||ro.yingyezongshouru"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="归母净利润" prop="guimujinglirun">
            <el-input v-model="ruleForm.guimujinglirun" 
                placeholder="归母净利润" clearable :disabled=" false  ||ro.guimujinglirun"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="股票简介" prop="gupiaojianjie">
            <el-input v-model="ruleForm.gupiaojianjie" 
                placeholder="股票简介" clearable :disabled=" false  ||ro.gupiaojianjie"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="股票图片" v-if="type!='cross' || (type=='cross' && !ro.gupiaotupian)" prop="gupiaotupian">
            <file-upload
            tip="点击上传股票图片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.gupiaotupian?ruleForm.gupiaotupian:''"
            @change="gupiaotupianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' class="upload" v-else label="股票图片" prop="gupiaotupian">
                <img v-if="ruleForm.gupiaotupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.gupiaotupian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.gupiaotupian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>

      <el-form-item :style='{"width":"100%","padding":"0","margin":"0","textAlign":"center"}'>
        <el-button :style='{"border":"0px solid #eccc19","cursor":"pointer","padding":"0","margin":"0 20px 0 0","color":"#fff","borderRadius":"20px","background":"#0062a5","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"1px solid #ccc","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#666","borderRadius":"20px","background":"none","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
	  let self = this
      return {
        id: '',
        baseUrl: '',
        ro:{
				gupiaodaima : false,
				gupiaomingcheng : false,
				gupiaoleixing : false,
				lishizuigaojia : false,
				lishizuidijia : false,
				shijinglv : false,
				shiyinglv : false,
				shixiaolv : false,
				zongguben : false,
				zongshizhi : false,
				liutonggu : false,
				liutongzhi : false,
				yingyezongshouru : false,
				guimujinglirun : false,
				gupiaojianjie : false,
				gupiaotupian : false,
				clicktime : false,
				clicknum : false,
				storeupnum : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          gupiaodaima: '',
          gupiaomingcheng: '',
          gupiaoleixing: '',
          lishizuigaojia: '',
          lishizuidijia: '',
          shijinglv: '',
          shiyinglv: '',
          shixiaolv: '',
          zongguben: '',
          zongshizhi: '',
          liutonggu: '',
          liutongzhi: '',
          yingyezongshouru: '',
          guimujinglirun: '',
          gupiaojianjie: '',
          gupiaotupian: '',
          clicktime: '',
          clicknum: '',
          storeupnum: '',
        },
        gupiaoleixingOptions: [],


        rules: {
          gupiaodaima: [
          ],
          gupiaomingcheng: [
          ],
          gupiaoleixing: [
          ],
          lishizuigaojia: [
          ],
          lishizuidijia: [
          ],
          shijinglv: [
          ],
          shiyinglv: [
          ],
          shixiaolv: [
          ],
          zongguben: [
          ],
          zongshizhi: [
          ],
          liutonggu: [
          ],
          liutongzhi: [
          ],
          yingyezongshouru: [
          ],
          guimujinglirun: [
          ],
          gupiaojianjie: [
          ],
          gupiaotupian: [
          ],
          clicktime: [
          ],
          clicknum: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          storeupnum: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
        },
		centerType: false,
      };
    },
    computed: {



    },
    components: {
    },
    created() {
		if(this.$route.query.centerType){
			this.centerType = true
		}
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='gupiaodaima'){
              this.ruleForm.gupiaodaima = obj[o];
              this.ro.gupiaodaima = true;
              continue;
            }
            if(o=='gupiaomingcheng'){
              this.ruleForm.gupiaomingcheng = obj[o];
              this.ro.gupiaomingcheng = true;
              continue;
            }
            if(o=='gupiaoleixing'){
              this.ruleForm.gupiaoleixing = obj[o];
              this.ro.gupiaoleixing = true;
              continue;
            }
            if(o=='lishizuigaojia'){
              this.ruleForm.lishizuigaojia = obj[o];
              this.ro.lishizuigaojia = true;
              continue;
            }
            if(o=='lishizuidijia'){
              this.ruleForm.lishizuidijia = obj[o];
              this.ro.lishizuidijia = true;
              continue;
            }
            if(o=='shijinglv'){
              this.ruleForm.shijinglv = obj[o];
              this.ro.shijinglv = true;
              continue;
            }
            if(o=='shiyinglv'){
              this.ruleForm.shiyinglv = obj[o];
              this.ro.shiyinglv = true;
              continue;
            }
            if(o=='shixiaolv'){
              this.ruleForm.shixiaolv = obj[o];
              this.ro.shixiaolv = true;
              continue;
            }
            if(o=='zongguben'){
              this.ruleForm.zongguben = obj[o];
              this.ro.zongguben = true;
              continue;
            }
            if(o=='zongshizhi'){
              this.ruleForm.zongshizhi = obj[o];
              this.ro.zongshizhi = true;
              continue;
            }
            if(o=='liutonggu'){
              this.ruleForm.liutonggu = obj[o];
              this.ro.liutonggu = true;
              continue;
            }
            if(o=='liutongzhi'){
              this.ruleForm.liutongzhi = obj[o];
              this.ro.liutongzhi = true;
              continue;
            }
            if(o=='yingyezongshouru'){
              this.ruleForm.yingyezongshouru = obj[o];
              this.ro.yingyezongshouru = true;
              continue;
            }
            if(o=='guimujinglirun'){
              this.ruleForm.guimujinglirun = obj[o];
              this.ro.guimujinglirun = true;
              continue;
            }
            if(o=='gupiaojianjie'){
              this.ruleForm.gupiaojianjie = obj[o];
              this.ro.gupiaojianjie = true;
              continue;
            }
            if(o=='gupiaotupian'){
              this.ruleForm.gupiaotupian = obj[o].split(",")[0];
              this.ro.gupiaotupian = true;
              continue;
            }
            if(o=='clicktime'){
              this.ruleForm.clicktime = obj[o];
              this.ro.clicktime = true;
              continue;
            }
            if(o=='clicknum'){
              this.ruleForm.clicknum = obj[o];
              this.ro.clicknum = true;
              continue;
            }
            if(o=='storeupnum'){
              this.ruleForm.storeupnum = obj[o];
              this.ro.storeupnum = true;
              continue;
            }
          }
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
          }
        });
        this.$http.get('option/gupiaoleixing/gupiaoleixing', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.gupiaoleixingOptions = res.data.data;
          }
        });

		if (localStorage.getItem('raffleType') && localStorage.getItem('raffleType') != null) {
			localStorage.removeItem('raffleType')
			setTimeout(() => {
				this.onSubmit()
			}, 300)
		}
      },

    // 多级联动参数
      // 多级联动参数
      info() {
        this.$http.get(`gupiaoxinxi/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {
			//更新跨表属性
			var crossuserid;
			var crossrefid;
			var crossoptnum;
			this.$refs["ruleForm"].validate(valid => {
				if(valid) {
					if(this.type=='cross'){
						var statusColumnName = localStorage.getItem('statusColumnName');
						var statusColumnValue = localStorage.getItem('statusColumnValue');
						if(statusColumnName && statusColumnName!='') {
							var obj = JSON.parse(localStorage.getItem('crossObj'));
							if(!statusColumnName.startsWith("[")) {
								for (var o in obj){
									if(o==statusColumnName){
										obj[o] = statusColumnValue;
									}
								}
								var table = localStorage.getItem('crossTable');
								this.$http.post(table+'/update', obj).then(res => {});
							} else {
								crossuserid=Number(localStorage.getItem('frontUserid'));
								crossrefid=obj['id'];
								crossoptnum=localStorage.getItem('statusColumnName');
								crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
							}
						}
					}
					if(crossrefid && crossuserid) {
						this.ruleForm.crossuserid=crossuserid;
						this.ruleForm.crossrefid=crossrefid;
						var params = {
							page: 1,
							limit: 10,
							crossuserid:crossuserid,
							crossrefid:crossrefid,
						}
						this.$http.get('gupiaoxinxi/list', {
							params: params
						}).then(res => {
							if(res.data.data.total>=crossoptnum) {
								this.$message({
									message: localStorage.getItem('tips'),
									type: 'error',
									duration: 1500,
								});
								return false;
							} else {
								// 跨表计算


								this.$http.post(`gupiaoxinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
									if (res.data.code == 0) {
										this.$message({
											message: '操作成功',
											type: 'success',
											duration: 1500,
											onClose: () => {
												this.$router.go(-1);
											}
										});
									} else {
										this.$message({
											message: res.data.msg,
											type: 'error',
											duration: 1500
										});
									}
								});
							}
						});
					} else {


						this.$http.post(`gupiaoxinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
							if (res.data.code == 0) {
								this.$message({
									message: '操作成功',
									type: 'success',
									duration: 1500,
									onClose: () => {
										this.$router.go(-1);
									}
								});
							} else {
								this.$message({
									message: res.data.msg,
									type: 'error',
									duration: 1500
								});
							}
						});
					}
				}
			});
		},
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		// 返回
		back() {
			this.$router.go(-1);
		},
      gupiaotupianUploadChange(fileUrls) {
          this.ruleForm.gupiaotupian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 120px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 120px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 1px solid #ddd;
	  padding: 0 12px;
	  color: #666;
	  font-size: 14px;
	  border-color: #ddd;
	  border-radius: 0px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  background: none;
	  width: auto;
	  border-width: 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 36px;
	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
	  border: 1px solid #ddd;
	  padding: 0 12px;
	  color: #666;
	  font-size: 14px;
	  border-color: #ddd;
	  border-radius: 0px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  background: none;
	  width: auto;
	  border-width: 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 36px;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border-radius: 0px;
	  padding: 0 10px;
	  color: #666;
	  background: none;
	  width: auto;
	  font-size: 14px;
	  border-color: #ddd;
	  border-width: 1px;
	  border-style: solid;
	  min-width: 350px;
	  height: 36px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border-radius: 0px;
	  padding: 0 10px 0 30px;
	  color: #666;
	  background: none;
	  width: auto;
	  font-size: 14px;
	  border-color: #ddd;
	  border-width: 1px;
	  border-style: solid;
	  min-width: 250px;
	  height: 36px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  cursor: pointer;
	  border-radius: 2px;
	  color: #999;
	  background: none;
	  width: 80px;
	  font-size: 24px;
	  border-color: #ddd;
	  border-width: 1px;
	  line-height: 80px;
	  border-style: solid;
	  text-align: center;
	  height: 80px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  cursor: pointer;
	  border-radius: 2px;
	  color: #999;
	  background: none;
	  width: 80px;
	  font-size: 24px;
	  border-color: #ddd;
	  border-width: 1px;
	  line-height: 80px;
	  border-style: solid;
	  text-align: center;
	  height: 80px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  cursor: pointer;
	  border-radius: 2px;
	  color: #999;
	  background: none;
	  width: 80px;
	  font-size: 24px;
	  border-color: #ddd;
	  border-width: 1px;
	  line-height: 80px;
	  border-style: solid;
	  text-align: center;
	  height: 80px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #ddd;
	  border-radius: 0px;
	  padding: 12px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  color: #666;
	  background: none;
	  width: 40%;
	  font-size: 14px;
	  height: 120px;
	}
</style>
