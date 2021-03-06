USE [db_worker1]
GO
/****** Object:  Table [dbo].[tb_worker]    Script Date: 12/17/2017 20:08:39 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_worker](
	[id] [tinyint] NOT NULL,
	[name] [nvarchar](1) NOT NULL,
	[salary] [money] NOT NULL,
	[deteline] [date] NOT NULL,
	[recommend] [bit] NOT NULL,
	[department] [nvarchar](1) NOT NULL,
	[remark] [ntext] NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Default [DF__tb_worker__salar__7E6CC920]    Script Date: 12/17/2017 20:08:39 ******/
ALTER TABLE [dbo].[tb_worker] ADD  DEFAULT ((5000)) FOR [salary]
GO
